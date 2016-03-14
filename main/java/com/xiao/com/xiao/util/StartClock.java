package com.xiao.com.xiao.util;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.xiao.dactorforeverybody.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/3/1.
 */
public class StartClock extends Activity{
    private List<PackageInfo> allPackageInfos;
    private List<PackageInfo> sysPackageInfos;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_clock);

                startSystemAlarm();

    }

    //过滤出系统应用
    private void getSystemApp(){
         allPackageInfos = getPackageManager().getInstalledPackages(PackageManager.GET_UNINSTALLED_PACKAGES
                 |PackageManager.GET_ACTIVITIES);
        sysPackageInfos = new ArrayList<PackageInfo>();

        if(allPackageInfos != null && !allPackageInfos.isEmpty()){
            for(PackageInfo apckageInfo : allPackageInfos){
                //得到每个软件信息
                ApplicationInfo appInfo = apckageInfo.applicationInfo;
                if((appInfo.flags & ApplicationInfo.FLAG_UPDATED_SYSTEM_APP)!=0
                        ||(appInfo.flags & ApplicationInfo.FLAG_SYSTEM)!=0){
                    //系统软件
                    sysPackageInfos.add(apckageInfo);
                }
            }
        }

    }

    //启动系统闹钟
    private void startSystemAlarm(){
        getSystemApp();

        String activityName = "";
        String packageName = "";
        String alarmPackageName = "";
        for(int i=0;i<sysPackageInfos.size();i++){
            PackageInfo packageInfo = sysPackageInfos.get(i);
            packageName = packageInfo.packageName;

            //包名中包含clock
            if(packageName.indexOf("clock")!=-1){
                if(!(packageName.indexOf("widget")!=-1)){
                    ActivityInfo activityInfo = packageInfo.activities[0];
                    //activity名中包含Alarm和DeskClock大部分的闹钟程序名中都是按照这种规则命名，不能保证所有闹钟都是这样
                    if(activityInfo.name.indexOf("Alarm")!=-1||activityInfo.name.indexOf("DeskClock")!=-1){
                        activityName = activityInfo.name;
                        alarmPackageName = packageName;
                    }
                }
            }
        }
        if((activityName!="")&&(alarmPackageName!="")){
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(alarmPackageName,activityName));
            startActivity(intent);
        }else{
           Toast.makeText(this, "启动闹钟失败！", Toast.LENGTH_SHORT).show();
        }
















    }
}
