package edu.polyu.screamalert;

public interface OnBluetoothRecording {

    void onStartRecording(boolean state,boolean bluetoothFlag);
    void onCancelRecording();
}