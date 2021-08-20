from imagekitio import ImageKit
from flask import Flask

app = Flask(__name__)

@app.route("/")
def hello_world():
    return "<p>Hello, World!</p>"
    
"""imagekit = ImageKit(
    private_key='private_UTwuFdOJoKH3tkWbe6iko+7SB4I=',
    public_key='public_TGL83sxiUWGZfYFL0MMz9r7AXTw=',
    url_endpoint = 'https://ik.imagekit.io/minecopre'
)"""

