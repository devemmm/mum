/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mumexercises;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gennext
 */
public class Factor {
    public static void main(String[] args) {
        System.out.println(factorEqual(9,10));
    }
    
    
    public static int factorEqual(int n, int m){

        List<Integer> nfactor = new ArrayList<>();
        List<Integer> mfactor = new ArrayList<>();

        for ( int i=1; i <= n; ++i){
           
            if(n % i == 0){
                nfactor.add(i);
            }
        }
        
        
        for ( int j=1; j <= m; ++j){
           
            if(m % j == 0){
               mfactor.add(j);
            }
        }
        
        if (nfactor.size() == mfactor.size()){
            return 1;
        }else{
            return 0;
        }
        
    }
}
