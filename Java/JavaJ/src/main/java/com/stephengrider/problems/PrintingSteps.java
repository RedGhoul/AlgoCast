package com.stephengrider.problems;
// --- Directions
// Write a function that accepts a positive number N.
// The function should console log a step shape
// with N levels using the # character.  Make sure the
// step has spaces on the right hand side! !!!!!!!!!!!
// --- Examples
//   steps(2)
//       '# '
//       '##'
//   steps(3)
//       '#  '
//       '## '
//       '###'
//   steps(4)
//       '#   '
//       '##  '
//       '### '
//       '####'
public class PrintingSteps {
    public static void main(String[] args){
        PrintSteps(100);
    }

    public static void PrintSteps(int numberOfSteps){
        String currentStep = "";
        for(int index = 0; index < numberOfSteps; index++){
            currentStep = currentStep + " ";
        }

        for(int step=0; step < numberOfSteps; step++){
            String begin = currentStep.substring(0,step);
            /*
            * You just need +1 here since substring(0,step)
            * does not include the value of the stuff at "step"
            * and substring(step+1) needs to avoid the stuff at
            * step, so that the "#" can find its place
            * */
            String end = currentStep.substring(step+1);
            currentStep = begin + "#" + end;

//            int lengthss = currentStep.length();
//            System.out.println("current length " + lengthss);
            System.out.println(currentStep);
        }
    }
}
