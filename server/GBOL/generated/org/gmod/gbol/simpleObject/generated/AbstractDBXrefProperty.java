package org.gmod.gbol.simpleObject.generated;


import org.gmod.gbol.simpleObject.*; 


/**
 * DBXrefProperty generated by hbm2java
 */
public abstract class AbstractDBXrefProperty extends AbstractSimpleObject implements java.io.Serializable {


     private Integer dbxrefPropertyId;
     private DBXref dbxref;
     private CVTerm type;
     private String value;
     private int rank;

    public AbstractDBXrefProperty() {
    }

    public AbstractDBXrefProperty(DBXref dbxref, CVTerm type, String value, int rank) {
       this.dbxref = dbxref;
       this.type = type;
       this.value = value;
       this.rank = rank;
    }
   
    public Integer getDbxrefPropertyId() {
        return this.dbxrefPropertyId;
    }
    
    public void setDbxrefPropertyId(Integer dbxrefPropertyId) {
        this.dbxrefPropertyId = dbxrefPropertyId;
    }
    public DBXref getDbxref() {
        return this.dbxref;
    }
    
    public void setDbxref(DBXref dbxref) {
        this.dbxref = dbxref;
    }
    public CVTerm getType() {
        return this.type;
    }
    
    public void setType(CVTerm type) {
        this.type = type;
    }
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    public int getRank() {
        return this.rank;
    }
    
    public void setRank(int rank) {
        this.rank = rank;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractDBXrefProperty) ) return false;
		 AbstractDBXrefProperty castOther = ( AbstractDBXrefProperty ) other; 
         
		 return ( (this.getDbxref()==castOther.getDbxref()) || ( this.getDbxref()!=null && castOther.getDbxref()!=null && this.getDbxref().equals(castOther.getDbxref()) ) )
 && ( (this.getType()==castOther.getType()) || ( this.getType()!=null && castOther.getType()!=null && this.getType().equals(castOther.getType()) ) )
 && (this.getRank()==castOther.getRank());
   }
   
   public int hashCode() {
         int result = 17;
         
         
         result = 37 * result + ( getDbxref() == null ? 0 : this.getDbxref().hashCode() );
         result = 37 * result + ( getType() == null ? 0 : this.getType().hashCode() );
         
         result = 37 * result + this.getRank();
         return result;
   }   

public AbstractDBXrefProperty generateClone() {
	AbstractDBXrefProperty cloned = new AbstractDBXrefProperty; 
    	   cloned.dbxref = this.dbxref;
    	   cloned.type = this.type;
    	   cloned.value = this.value;
    	   cloned.rank = this.rank;
	return cloned;
}


}

