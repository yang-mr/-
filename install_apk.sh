#!/bin/sh
adb connect 192.168.50.211
adb -s 192.168.50.211:5555 uninstall com.cafari.boxserver

adb -s 192.168.50.211:5555 shell "rm -rR /storage/emulated/0/cafari"
echo "remove file success "
#rm -rR /storage/emulated/0/cafari

#adb exit

adb -s 192.168.50.211:5555 install -r /home/jack/Downloads/app-armeabi-v7a-debug.apk

adb -s 192.168.50.211:5555 shell am start -n com.cafari.boxserver/com.cafari.boxserver.ui.LaunchActivity

#obtain mac address 
#adb shell  cat /sys/class/net/wlan0/address
