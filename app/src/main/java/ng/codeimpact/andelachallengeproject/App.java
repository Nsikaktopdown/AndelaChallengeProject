package ng.codeimpact.andelachallengeproject;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Nsikak  Thompson on 3/11/2017.
 */

public class App extends Application {



    @Override
    public void onCreate() {
        super.onCreate();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/ChronicaPro-Regular.otf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );}
}