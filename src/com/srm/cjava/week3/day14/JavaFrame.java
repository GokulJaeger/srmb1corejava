package com.srm.cjava.week3.day14;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;

public class JavaFrame {

  public static void main(String[] args) {
    Frame frame = new Frame("MyFrame");

    Component textArea = new TextArea("Hi I'am Gokul");

    Component button = new Button("Submit");

    frame.add(textArea, BorderLayout.NORTH);

    frame.add(button, BorderLayout.SOUTH);

    int width = 300;

    int height = 300;

    frame.setSize(width, height);

    frame.setVisible(true);
  }
}