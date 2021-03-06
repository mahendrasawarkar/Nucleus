package in.solpro.nucleus.apps.common;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class AddressType extends BaseObject{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column( nullable=false)
	private String name;
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String toString() {
		return this.name;
	}
	
	@Override
	public boolean equals( Object obj )
	{
	    if (obj instanceof AddressType)
	    {
	        return this.name.equals( ((AddressType)obj).getName() );
	    }
	    return super.equals( obj );
	}
	
	@Override
	public int hashCode()
	{
	    return id;
	}
}
