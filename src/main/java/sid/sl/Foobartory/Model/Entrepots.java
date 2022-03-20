package sid.sl.Foobartory.Model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
@AllArgsConstructor
public class Entrepots {
	
	    private int euros;
	    private List<Foo> listFoo = new ArrayList<Foo>(); ;
	    private List<Bar> listBar = new ArrayList<Bar>();
	    private List<FooBar> listFooBar = new ArrayList<FooBar>();;
	    
	    public synchronized Entrepots updateEntrepots(Entrepots newEntrepots) {

	        this.euros += newEntrepots.getEuros();
	        return this;
	    }
	    
	    public synchronized void addFoo(Foo foo)
	    {
	    	this.listFoo.add(foo);
	    }
	    public synchronized void addBar(Bar bar)
	    {
	    	this.listBar.add(bar);
	    }
	    public synchronized Foo deleteFoo()
	    {
	    	return this.getListFoo().remove(this.getListFoo().size() - 1);
	    }
	    public  synchronized Bar deleteBar()
	    {
	    	return  this.getListBar().remove(this.getListBar().size() - 1);
	    }
	    

}
