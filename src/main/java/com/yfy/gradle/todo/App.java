package com.yfy.gradle.todo;
/*
 * @author youfy
 * DATE 2020/2/2
 *
 * java -classpath build/libs/groovy_base-1.0-SNAPSHOT.jar com.yfy.gradle.todo.App
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        while (++i>0){
            System.out.println(i+".please input todo item name;");
            TodoItem item = new TodoItem(scanner.nextLine());
            System.out.println(item);
        }
    }
}
