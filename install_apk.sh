#!/bin/sh
#adb connect 192.168.50.211
adb -s kylin uninstall com.cafari.boxserver

adb -s kylin shell "rm -rR /storage/emulated/0/cafari"
echo "remove file success "
#rm -rR /storage/emulated/0/cafari

#adb exit

adb -s kylin install -r /home/jack/Downloads/app-armeabi-v7a-debug.apk

adb -s kylin shell am start -n com.cafari.boxserver/com.cafari.boxserver.ui.LaunchActivity

#obtain mac address 
#adb shell  cat /sys/class/net/wlan0/address

#copy file
#adb -s kylin pull /storage/hdd/cafari/.database ~/database

#1. Format the disk device (may be optional):
#busybox fdisk -u /dev/block/vold/disk:8,0

#2. Create file system on the device:
#mke2fs -t ext4 /dev/block/vold/disk:8,0

#3. Mount the file system
#mount -t ext4  /dev/block/vold/disk:8,0 /storage/cafebox」

# look device all package
# adb -s kylin shell pm list package -3

# look app desctipiton
# adb -s kylin shell dumpsys package com.zjxx.android.cafebox

#查看启动时间
#adb -s 559e2c30 shell am start -W com.cafari.boxclient/com.cafari.boxclient.ui.SplashActivity

#pull db
adb -s kylin pull storage/hdd/cafari/.database/photocomb.db ./Downloads 
