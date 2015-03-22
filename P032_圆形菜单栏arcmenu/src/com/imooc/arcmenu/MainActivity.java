package com.imooc.arcmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.imooc.arcmenu.view.ArcMenu;
import com.imooc.arcmenu.view.ArcMenu.OnMenuItemClickListener;

public class MainActivity extends Activity {
	private ArcMenu mArcMenu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		initEvent();

	}

	private void initEvent() {
		// mListView.setOnScrollListener(new OnScrollListener()
		// {
		//
		// @Override
		// public void onScrollStateChanged(AbsListView view, int scrollState)
		// {
		//
		// }
		//
		// @Override
		// public void onScroll(AbsListView view, int firstVisibleItem,
		// int visibleItemCount, int totalItemCount)
		// {
		// if (mArcMenu.isOpen())
		// mArcMenu.toggleMenu(600);
		// }
		// });

		mArcMenu.setOnMenuItemClickListener(new OnMenuItemClickListener() {
			@Override
			public void onClick(View view, int pos) {
				Toast.makeText(MainActivity.this, pos + ":" + view.getTag(),
						Toast.LENGTH_SHORT).show();
			}
		});
	}

	private void initView() {
		mArcMenu = (ArcMenu) findViewById(R.id.id_menu);
	}

}
