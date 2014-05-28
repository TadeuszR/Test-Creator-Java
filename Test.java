/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testcreator;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Tadeusz
 */
public class Test implements Serializable
{
    Test()
    {
        test = new Vector<>();
        skala = new Double[9];
        skala[0] = 1.1;//2 // 2 jako dop.
        skala[1] = 1.1;//2+
        skala[2] = 0.5;//3
        skala[3] = 0.6;//3+
        skala[4] = 0.7;//4
        skala[5] = 0.8;//4+
        skala[6] = 0.9;//5
        skala[7] = 1.1;//5+
        skala[8] = 1.1;//6
    } 
    Vector<Question> test;
    Double[] skala;
    void load(){};
    void save(){};
    void addQuestion(Question q)
    {
        Question w = new Question(q);
        test.addElement(w);
    }
    String countMark()
    {
        int N = test.size();
        int n = 0;
        String qs = "";
        
        for (int i = 0; i < N ; ++i)
        {
            if (test.elementAt(i).marked == test.elementAt(i).right_ans)
            {
                n++;
            }
        }
        Double wynik = 100.0*n/N;
        qs = qs.concat( "Twój wynik to \n");
        qs = qs.concat(wynik.toString());
        qs = qs.concat(" %\n");
        int i;
    for (i = 8; i >= 0; --i)
    {
        if(wynik.doubleValue()>= skala[i].doubleValue()*100)
        {
            break;
        }
    }
    switch (i)
    {
        case -1:
        qs = qs.concat("niedostateczny"); break;
        case 0:
        qs = qs.concat("dopuszczający"); break;
        case 1:
        qs = qs.concat("dopuszczający +"); break;
        case 2:
        qs = qs.concat("dostateczny"); break;
        case 3:
        qs = qs.concat("dostateczny +"); break;
        case 4:
        qs = qs.concat("dobry"); break;
        case 5:
        qs = qs.concat("dobry +"); break;
        case 6:
        qs = qs.concat("bardzo dobry"); break;
        case 7:
        qs = qs.concat("bardzo dobry +"); break;
        case 8:
        qs = qs.concat("celujący"); break;
    }
        return qs;
    }
    /**
     *
     * @return Returns String representation, ready to put on Label.
     */
    @Override
    public String toString()
    {   
        String tmp = new String();
        //tmp.concat("Pytanie: ");
        for(int i = 0; i < test.size(); ++i)
        {
            tmp = tmp.concat("Pytanie "+i+". " + test.elementAt(i) +"\n");
        }
        tmp = tmp.concat("\n");
        return tmp;
    }
    
};

