/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testcreator;

import java.io.Serializable;

/**
 *
 * @author Tadeusz
 */
public class Question implements Serializable
{
    Question()
    {
        ans = new String[9];
        count = 0;
        right_ans = 0;
        marked = -1;
    }
    Question(int i)
    {
        ans = new String[9];
        count = i;
        marked = -1;
        right_ans = 0;

    }
    Question(Question q)
    {
        ans = new String[9];
        quest = q.quest;
        for (int i = 0 ; i < 9; ++i)
        {
            ans[i] = q.ans[i];
        }
        count = q.count;
        marked = q.marked;
        right_ans = q.right_ans;

    }
    void setQuest(String s)
    {
        quest = s;
    }
    String getQuest()
    {
        return quest;
    }
    int getCount()
    {
        return count;
    }
    String getAns(int i)
    {
        return ans[i];
    }
    void addAnswer(String s)
    {
       // if (this.count > 8 ) 
        //{
         //   return;
        //}
        ans[count++] = s;
    }
    void setRight(int i)
    {
        right_ans = i;
    }
    String quest;
    String[] ans;
    int count;
    int right_ans;
    int marked ;
    /**
     *Sets right answer
     * @return
     */
    @Override
    public String toString()
    {   
        String tmp = new String();
        //tmp = tmp.concat("Pytanie: ");
        tmp = tmp.concat(quest + "\n");
        for(int i = 0; i < count; ++i)
        {
            tmp = tmp.concat("\t"+i+". " + ans[i] +"\n");
        }
        return tmp;
    }
};
