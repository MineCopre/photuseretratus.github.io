<?php

if (is_file(__DIR__ . '/../vendor/autoload.php') && is_readable(__DIR__ . '/../vendor/autoload.php')) {
    require_once __DIR__ . '/../vendor/autoload.php';
} else {
    // Fallback to legacy autoloader
    require_once __DIR__ . '/../autoload.php';
}

use ImageKit\ImageKit;

$imageKit = new ImageKit(
    "public_TGL83sxiUWGZfYFL0MMz9r7AXTw=",
    "private_UTwuFdOJoKH3tkWbe6iko+7SB4I=",
    "https://ik.imagekit.io/minecopre"
);

class SimpleClass
{
    // property declaration
    public $var = 'a default value';

    // method declaration
    public function displayVar() {
        echo $this->var;
    }
}

?>