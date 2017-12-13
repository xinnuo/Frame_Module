package nl.dionsegijn.pixelate;

import android.graphics.Bitmap;

public interface OnPixelateListener {
    void onPixelated(final Bitmap bitmap, int density);
}
