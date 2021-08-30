package SkillAssessments;
/*
LinkedIn - skill-assessments
What is the output of this code?
3true
*/
import java.util.*;

public class test_01{

    public static void main(String[] args){

        List<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(Boolean.parseBoolean("FalSe"));
        list.add(Boolean.TRUE);
        System.out.print(list.size());
        System.out.print(list.get(0) instanceof Boolean);       

    }
}