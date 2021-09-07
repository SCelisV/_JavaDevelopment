package SkillAssessments;
/*
LinkedIn - skill-assessments
*/

import java.awt.*;
import java.awt.event.*;

public class test_23{
    

    public static void main(String[] args){

        /* lambda expression:
        npi

        */
        Button grouchyButton = new Button();

        grouchyButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Press me one more time...");
            }

        });

        grouchyButton.addActionListener(ActionListener ->  System.out.println("Press me one more time..."));

        grouchyButton.addActionListener(() ->  System.out.println("Press me one more time..."));

        grouchyButton.addActionListener((event) ->  System.out.println("Press me one more time..."));

        // grouchyButton.addActionListener(new ActionListener(ActionEvent e) {() ->  System.out.println("Press me one more time...");});


    }
}