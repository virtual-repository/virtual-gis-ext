package org.virtualrepository.ows;

import org.virtualrepository.Property;
import org.virtualrepository.RepositoryService;
import org.virtualrepository.comet.CometAsset;
import org.virtualrepository.impl.AbstractAsset;
import org.virtualrepository.impl.AbstractType;
import org.virtualrepository.impl.Type;

/**
 * A Virtual-repository WFS FeatureType asset definition
 * 
 * @author fabiosimeoni
 *
 */
public class WfsFeatureType extends AbstractAsset {
	
	public static final Type<WfsFeatureType> type = new AbstractType<WfsFeatureType>( "wfs/feature") {};
	
	
	public <T extends CometAsset> WfsFeatureType(String id, String name, Property ... properties) {
		
		super(type,id,name,properties);

	}
	
	public <T extends CometAsset> WfsFeatureType(String id, String name, RepositoryService service, Property ... properties) {
		
		super(type,id,name,service, properties);

	}
	
	
}
