import base64
import sys

sys.path.append("..")

# #### set your private_key public_key, url_endpoint, url ### ##
private_key = "private_UTwuFdOJoKH3tkWbe6iko+7SB4I="
public_key = "public_TGL83sxiUWGZfYFL0MMz9r7AXTw="
url_endpoint = "https://ik.imagekit.io/minecopre"
# dummy image url
url = "https://file-examples.com/wp-content/uploads/2017/10/file_example_JPG_100kB.jpg"

if __name__ == "__main__":

    from imagekitio.client import ImageKit

    imagekit = ImageKit(
        private_key=private_key, public_key=public_key, url_endpoint=url_endpoint,
    )

    image_url = imagekit.url({
        "path": "assets/header.jpg",
        "url_endpoint": url_endpoint,
        "transformation": [{"height": "300", "width": "400"}],
    })