ACTIVITY MANAGER ACTIVITIES (dumpsys activity activities)
Display #0 (activities from top to bottom):
  Stack #1:
    Task id #42
    * TaskRecord{70860a9 #42 A=com.zjxx.android.cafebox U=0 sz=2}
      userId=0 effectiveUid=u0a198 mCallingUid=2000 mCallingPackage=null
      affinity=com.zjxx.android.cafebox
      intent={act=android.intent.action.MAIN cat=[android.intent.category.LAUNCHER] flg=0x10000000 cmp=com.zjxx.android.cafebox/.ui.MainActivity}
      realActivity=com.zjxx.android.cafebox/.ui.MainActivity
      autoRemoveRecents=false isPersistable=true numFullscreen=1 taskType=0 mTaskToReturnTo=1
      rootWasReset=false mNeverRelinquishIdentity=true mReuseTask=false mLockTaskAuth=LOCK_TASK_AUTH_PINNABLE
      Activities=[ActivityRecord{55b235d u0 com.zjxx.android.cafebox/.ui.MainActivity t42}, ActivityRecord{d6365cf u0 com.zjxx.android.cafebox/.ui.AlbumActivity t42}]
      askedCompatMode=false inRecents=true isAvailable=true
      lastThumbnail=null lastThumbnailFile=/data/system/recent_images/42_task_thumbnail.png
      stackId=1
      hasBeenVisible=true mResizeable=false firstActiveTime=1514280800314 lastActiveTime=1514280800314 (inactive for 14s)
      * Hist #1: ActivityRecord{d6365cf u0 com.zjxx.android.cafebox/.ui.AlbumActivity t42}
          packageName=com.zjxx.android.cafebox processName=com.zjxx.android.cafebox
          launchedFromUid=10198 launchedFromPackage=com.zjxx.android.cafebox userId=0
          app=ProcessRecord{7bad62e 4973:com.zjxx.android.cafebox/u0a198}
          Intent { act=VIEW_ALBUM cmp=com.zjxx.android.cafebox/.ui.AlbumActivity (has extras) }
          frontOfTask=false task=TaskRecord{70860a9 #42 A=com.zjxx.android.cafebox U=0 sz=2}
          taskAffinity=com.zjxx.android.cafebox
          realActivity=com.zjxx.android.cafebox/.ui.AlbumActivity
          baseDir=/data/app/com.zjxx.android.cafebox-2/base.apk
          dataDir=/data/user/0/com.zjxx.android.cafebox
          stateNotNeeded=false componentSpecified=true mActivityType=0
          compat={320dpi} labelRes=0x7f0f0050 icon=0x7f0e0000 theme=0x7f1000b4
          config={1.0 460mcc1mnc zh_CN ldltr sw360dp w360dp h616dp 320dpi nrml long port finger -keyb/v/h -nav/h s.16 themeId=0, affectGlobal:true}
          stackConfigOverride={1.0 ?mcc?mnc ?locale ?layoutDir ?swdp ?wdp ?hdp ?density ?lsize ?long ?orien ?uimode ?night ?touch ?keyb/?/? ?nav/? themeId=0, affectGlobal:true}
          resultTo=ActivityRecord{55b235d u0 com.zjxx.android.cafebox/.ui.MainActivity t42} resultWho=null resultCode=7
          taskDescription: iconFilename=42_activity_icon_1514280661268.png label="CafeBox" color=fffafafa
          launchFailed=false launchCount=0 lastLaunchTime=-2m33s101ms
          haveState=false icicle=null
          state=RESUMED stopped=false delayedResume=false finishing=false
          keysPaused=false inHistory=true visible=true sleeping=false idle=true
          fullscreen=false noDisplay=false immersive=false launchMode=1
          frozenBeforeDestroy=false forceNewConfig=false
          mActivityType=APPLICATION_ACTIVITY_TYPE
          waitingVisible=false nowVisible=true lastVisibleTime=-6s381ms
      * Hist #0: ActivityRecord{55b235d u0 com.zjxx.android.cafebox/.ui.MainActivity t42}
          packageName=com.zjxx.android.cafebox processName=com.zjxx.android.cafebox
          launchedFromUid=2000 launchedFromPackage=null userId=0
          app=ProcessRecord{7bad62e 4973:com.zjxx.android.cafebox/u0a198}
          Intent { act=android.intent.action.MAIN cat=[android.intent.category.LAUNCHER] flg=0x10000000 cmp=com.zjxx.android.cafebox/.ui.MainActivity }
          frontOfTask=true task=TaskRecord{70860a9 #42 A=com.zjxx.android.cafebox U=0 sz=2}
          taskAffinity=com.zjxx.android.cafebox
          realActivity=com.zjxx.android.cafebox/.ui.MainActivity
          baseDir=/data/app/com.zjxx.android.cafebox-2/base.apk
          dataDir=/data/user/0/com.zjxx.android.cafebox
          stateNotNeeded=false componentSpecified=true mActivityType=0
          compat={320dpi} labelRes=0x7f0f0050 icon=0x7f0e0000 theme=0x7f1000b0
          config={1.0 460mcc1mnc zh_CN ldltr sw360dp w360dp h616dp 320dpi nrml long port finger -keyb/v/h -nav/h s.16 themeId=0, affectGlobal:true}
          stackConfigOverride={1.0 ?mcc?mnc ?locale ?layoutDir ?swdp ?wdp ?hdp ?density ?lsize ?long ?orien ?uimode ?night ?touch ?keyb/?/? ?nav/? themeId=0, affectGlobal:true}
          taskDescription: iconFilename=42_activity_icon_1514280613122.png label="CafeBox" color=fffafafa
          launchFailed=false launchCount=0 lastLaunchTime=-3m21s222ms
          haveState=true icicle=Bundle[mParcelledData.dataSize=4328]
          state=STOPPED stopped=true delayedResume=false finishing=false
          keysPaused=false inHistory=true visible=true sleeping=false idle=true
          fullscreen=true noDisplay=false immersive=false launchMode=1
          frozenBeforeDestroy=false forceNewConfig=false
          mActivityType=APPLICATION_ACTIVITY_TYPE
          waitingVisible=false nowVisible=true lastVisibleTime=-6s357ms

    Running activities (most recent first):
      TaskRecord{70860a9 #42 A=com.zjxx.android.cafebox U=0 sz=2}
        Run #1: ActivityRecord{d6365cf u0 com.zjxx.android.cafebox/.ui.AlbumActivity t42}
        Run #0: ActivityRecord{55b235d u0 com.zjxx.android.cafebox/.ui.MainActivity t42}

    mResumedActivity: ActivityRecord{d6365cf u0 com.zjxx.android.cafebox/.ui.AlbumActivity t42}
    mLastPausedActivity: ActivityRecord{1503fc7 u0 com.zjxx.android.cafebox/.ui.ItemActivity t42 f}

  Stack #0:
    Task id #1
    * TaskRecord{74f814b #1 A=com.bbk.launcher2 U=0 sz=1}
      userId=0 effectiveUid=u0a28 mCallingUid=1000 mCallingPackage=android
      affinity=com.bbk.launcher2
      intent={act=android.intent.action.MAIN cat=[android.intent.category.HOME] flg=0x10800000 cmp=com.bbk.launcher2/.Launcher}
      realActivity=com.bbk.launcher2/.Launcher
      autoRemoveRecents=false isPersistable=false numFullscreen=1 taskType=1 mTaskToReturnTo=0
      rootWasReset=false mNeverRelinquishIdentity=true mReuseTask=false mLockTaskAuth=LOCK_TASK_AUTH_PINNABLE
      Activities=[ActivityRecord{ae499c3 u0 com.bbk.launcher2/.Launcher t1}]
      askedCompatMode=false inRecents=true isAvailable=true
      lastThumbnail=null lastThumbnailFile=/data/system/recent_images/1_task_thumbnail.png
      stackId=0
      hasBeenVisible=true mResizeable=false firstActiveTime=1514280613128 lastActiveTime=1514280613128 (inactive for 201s)
      * Hist #0: ActivityRecord{ae499c3 u0 com.bbk.launcher2/.Launcher t1}
          packageName=com.bbk.launcher2 processName=com.bbk.launcher2
          launchedFromUid=0 launchedFromPackage=null userId=0
          app=ProcessRecord{5161c91 2422:com.bbk.launcher2/u0a28}
          Intent { act=android.intent.action.MAIN cat=[android.intent.category.HOME] flg=0x10800000 cmp=com.bbk.launcher2/.Launcher }
          frontOfTask=true task=TaskRecord{74f814b #1 A=com.bbk.launcher2 U=0 sz=1}
          taskAffinity=com.bbk.launcher2
          realActivity=com.bbk.launcher2/.Launcher
          baseDir=/system/app/BBKLauncher2/BBKLauncher2.apk
          dataDir=/data/user/0/com.bbk.launcher2
          stateNotNeeded=true componentSpecified=false mActivityType=1
          compat={320dpi} labelRes=0x7f0d0067 icon=0x7f0200cf theme=0x7f0e0001
          config={1.0 460mcc1mnc zh_CN ldltr sw360dp w360dp h616dp 320dpi nrml long port finger -keyb/v/h -nav/h s.16 themeId=0, affectGlobal:true}
          stackConfigOverride={1.0 ?mcc?mnc ?locale ?layoutDir ?swdp ?wdp ?hdp ?density ?lsize ?long ?orien ?uimode ?night ?touch ?keyb/?/? ?nav/? themeId=0, affectGlobal:true}
          taskDescription: iconFilename=null label="null" color=ffe6e6e6
          launchFailed=false launchCount=0 lastLaunchTime=-8h31m31s345ms
          haveState=true icicle=Bundle[mParcelledData.dataSize=11908]
          state=STOPPED stopped=true delayedResume=false finishing=false
          keysPaused=false inHistory=true visible=false sleeping=false idle=true
          fullscreen=true noDisplay=false immersive=false launchMode=2
          frozenBeforeDestroy=false forceNewConfig=false
          mActivityType=HOME_ACTIVITY_TYPE
          waitingVisible=false nowVisible=false lastVisibleTime=-3m22s124ms

    Running activities (most recent first):
      TaskRecord{74f814b #1 A=com.bbk.launcher2 U=0 sz=1}
        Run #0: ActivityRecord{ae499c3 u0 com.bbk.launcher2/.Launcher t1}

    mLastPausedActivity: ActivityRecord{ae499c3 u0 com.bbk.launcher2/.Launcher t1}

  mFocusedActivity: ActivityRecord{d6365cf u0 com.zjxx.android.cafebox/.ui.AlbumActivity t42}
  mFocusedStack=ActivityStack{1411728 stackId=1, 1 tasks} mLastFocusedStack=ActivityStack{1411728 stackId=1, 1 tasks}
  mSleepTimeout=false
  mCurTaskId=42
  mUserStackInFront={}
  mActivityContainers={0=ActivtyContainer{0}A, 1=ActivtyContainer{1}A}
  mLockTaskModeState=NONE mLockTaskPackages (userId:packages)=
    0:[]
 mLockTaskModeTasks[]
