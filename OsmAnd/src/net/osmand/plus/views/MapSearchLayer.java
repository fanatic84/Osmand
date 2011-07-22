package net.osmand.plus.views;

import android.R;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.Gravity;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MapSearchLayer implements OsmandMapLayer {

	private FrameLayout searchBox;
	private EditText searchEditText;
	private Button searchButton;
	
	@Override
	public void initLayer(OsmandMapTileView view) {
		android.widget.FrameLayout.LayoutParams params;
		
		FrameLayout parent = (FrameLayout) view.getParent();
	
		searchBox = new FrameLayout(view.getContext());
		searchBox.setBackgroundColor(R.color.black);
		
		params = new FrameLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT, Gravity.TOP);
		params.setMargins(60, 0, 0, 0);
		parent.addView(searchBox, params);
		
		searchButton = new Button(view.getContext());
		searchButton.setText("Search");
		params = new FrameLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, Gravity.TOP | Gravity.RIGHT);
		params.setMargins(0, 0, 0, 0);
		searchBox.addView(searchButton, params);
		
		searchEditText = new EditText(view.getContext());
		params = new FrameLayout.LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT, Gravity.TOP | Gravity.LEFT);
		params.setMargins(0, 0, 100, 0);
		searchBox.addView(searchEditText, params);

	}

	@Override
	public void onDraw(Canvas canvas, RectF latlonRect, RectF tilesRect,
			boolean nightMode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroyLayer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onTouchEvent(PointF point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onLongPressEvent(PointF point) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean drawInScreenPixels() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
