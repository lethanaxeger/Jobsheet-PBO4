/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum;

/**
 *
 * @author WINDOWS 10
 */
public class ujiRect {
    public static void main(String[] args) {
        Rect pusing = new Rect(1,1,4,4);
        int a = pusing.x1;
        int b = pusing.y1;
        int c = pusing.x2;
        int d = pusing.y2;
        
        Rect pusing2 = new Rect(5, 6);
        pusing.move(1, 2);
        System.out.println("<" + pusing.x1 + "," + pusing.y1 + "> is inside the union" );
        System.out.println("[" + a + "," + b + "; " + c + "," + d + "] union [" + pusing.x1 + "," + pusing.y1 + "; " + pusing.x2 + "," + pusing.y2 + "] = [" + a + "," + b + "; " + pusing.x2 + "," + pusing.y2 + "]");
        System.out.println("[" + a + "," + b + "; " + c + "," + d + "] union [" + pusing.x1 + "," + pusing.y1 + "; " + pusing.x2 + "," + pusing.y2 + "] = [" + pusing.x1 + "," + pusing.y1 + "; " + c + "," + d + "]");
    }
}
