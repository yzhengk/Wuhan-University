package com.njupt.zhb.test;
public class TestMain {
  public static void main(String[] args) {
    System.out.println("Hello, OpenCV");
    // Load the native library.
    System.loadLibrary("opencv_java246");
    new DetectFaceDemo().run();
  }
}
//���н��:
//Hello, OpenCV
//
//Running DetectFaceDemo
///E:/eclipse_Jee/workspace/JavaOpenCV246/bin/com/njupt/zhb/test/lbpcascade_frontalface.xml
//Detected 8 faces
//Writing faceDetection.png
