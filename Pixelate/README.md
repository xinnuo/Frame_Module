[![Twitter](https://img.shields.io/badge/Twitter-@dionsegijn-blue.svg?style=flat)](http://twitter.com/dionsegijn)

# Pixelate(马赛克)
Simple Android library to pixelate images or certain areas of an image.

<img src="https://github.com/DanielMartinus/Pixelate/blob/master/images/pixelate.jpg" width="240" /> <img src="https://github.com/DanielMartinus/Pixelate/blob/master/images/pixelate12.jpg" width="240" /> <img src="https://github.com/DanielMartinus/Pixelate/blob/master/images/pixelate128.jpg" width="240" />

## Usage

Simply instantiate Pixelate, give it a bitmap and set the density. This will pixelate your whole image.

```Java
new Pixelate(getBitmap())
		.setDensity(12)
		.setListener(this)
		.make();
```

If you want it to work with your ImageView and only pixelate a certain area:

```Java
new Pixelate(imageView)
		.setArea(x, y, width, height)
		.setDensity(density)
		.make();
```

Use the `OnPixelateListener` to handle the bitmap yourself after it being processed.

```Java
void onPixelated(Bitmap bitmap, int density) {

}
```



Download
--------

Available via Maven:

```groovy
compile 'nl.dionsegijn:pixelate:1.1.0'
```

License
-------

    Copyright 2015 Dion Segijn

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
    
    
    
