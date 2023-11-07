
import os

folder_path = "/home/aiker/Workspace/Java/JavaSpaceInvaders/images"

for filename in os.listdir(folder_path):
    if filename.endswith("_1.wav") or filename.endswith("_1.gif") or filename.endswith("_1.png"):
        os.remove(os.path.join(folder_path, filename))
