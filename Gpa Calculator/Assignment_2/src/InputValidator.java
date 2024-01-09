/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author graxe
 */
package com.cgpacalculator.utils;

public class InputValidator {
    public static boolean isValidCourseScore(int courseScore) {
        return courseScore >= 0 && courseScore <= 100;
    }

    public static boolean isValidCourseNameAndCode(String courseName) {
        return courseName != null && !courseName.trim().isEmpty();
    }

    public static boolean isValidInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
