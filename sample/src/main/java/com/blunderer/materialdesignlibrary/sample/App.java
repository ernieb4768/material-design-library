package com.blunderer.materialdesignlibrary.sample;

import android.content.Context;
/**
 * Created by rhoffman on 7/19/16.
 */

public class App extends android.app.Application {

	private static Context context;

	@Override
	public void onCreate() {
		super.onCreate();
		context = this;
	}

	public static Context getContext() {
		return context;
	}
}
