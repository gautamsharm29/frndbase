import os
import glob
import time
from androguard.misc import AnalyzeDex

def analyze_dex(dex_path, output_file):
    print(f"Analyzing {dex_path}...")
    start_time = time.time()

    try:
        h, d, dx = AnalyzeDex(dex_path)
    except Exception as e:
        print(f"AnalyzeDex failed: {e}")
        return

    print(f"Analysis took {time.time() - start_time:.2f}s")

    if isinstance(d, list):
        d_list = d
    else:
        d_list = [d]

    target_packages = [
        "Lcom/dating/chat/purchase",
        "Lcom/dating/domain/intractors/wallet"
    ]

    found_count = 0
    with open(output_file, "a") as out:
        for d_obj in d_list:
            classes = d_obj.get_classes()
            print(f"Total classes in {dex_path}: {len(classes)}")

            for cls in classes:
                class_name = cls.get_name()
                if any(pkg in class_name for pkg in target_packages):
                    found_count += 1
                    print(f"Found class: {class_name}")
                    out.write(f"\n\n// Class: {class_name}\n")

                    for method in cls.get_methods():
                        method_name = method.get_name()
                        out.write(f"\n// Method: {method_name}\n")

                        try:
                            src = method.get_source()
                            if src:
                                out.write(src)
                            else:
                                out.write("// No source code available\n")
                        except Exception as e:
                            out.write(f"// Error decompiling: {e}\n")
    print(f"Found {found_count} classes in {dex_path}")

if __name__ == "__main__":
    output_path = "decompiled_payment_logic.java"
    # Append mode

    dex_file = "base/classes3.dex"
    if os.path.exists(dex_file):
        try:
            analyze_dex(dex_file, output_path)
        except Exception as e:
            print(f"Error processing {dex_file}: {e}")
