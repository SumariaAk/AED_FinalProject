/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;



/**
 *
 * @author vinithiteshharsora
 */

    
    public enum Enterprise{
        Manufacturer("Manufacturer"),
        Distributor("Distributor"),
        Hospital("Hospital"),
        DepartmentOfHealth("DepartmentOfHealth");
        
        private String value;
        
        private Enterprise(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
            return value;
        }
    }
    
   