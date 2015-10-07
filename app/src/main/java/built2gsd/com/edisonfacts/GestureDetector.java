package built2gsd.com.edisonfacts;

import android.view.MotionEvent;

/**
 * Created by Ken on 10/6/2015.
 */
public class GestureDetector implements android.view.GestureDetector.OnGestureListener,
        android.view.GestureDetector.OnDoubleTapListener
{
    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        mGestureText.setText("onFling");
        return true;
}
