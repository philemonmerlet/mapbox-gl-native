package com.mapbox.mapboxsdk.annotations;

import android.graphics.Bitmap;

import com.mapbox.mapboxsdk.maps.MapView;

/**
 * Icon is the visual representation of a {@link Marker} on a {@link MapView}.
 * @see Marker
 */
public final class Icon {
    private Bitmap mBitmap;
    private String mId;

    private float mOffsetX;
    private float mOffsetY;

    private int mZOrder;

    Icon(String id, Bitmap bitmap) {
        mId = id;
        mBitmap = bitmap;
    }

    Icon(String id, Bitmap bitmap, float offsetX, float offsetY) {
        this(id, bitmap);
        mOffsetX = offsetX;
        mOffsetY = offsetY;
    }

    public void setOffset(float x, float y) {
        mOffsetX = x;
        mOffsetY = y;
    }

    public void setZOrder(int zOrder) {
        mZOrder = zOrder;
    }

    public String getId() {
        return mId;
    }

    public Bitmap getBitmap() {
        return mBitmap;
    }

    public float getOffsetX() {
        return mOffsetX;
    }

    public float getOffsetY() {
        return mOffsetY;
    }

    public int getZOrder() {
        return mZOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Icon icon = (Icon) o;

        if (!mBitmap.equals(icon.mBitmap)) return false;
        return mId.equals(icon.mId);

    }

    @Override
    public int hashCode() {
        int result = mBitmap.hashCode();
        result = 31 * result + mId.hashCode();
        return result;
    }
}
