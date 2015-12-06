package messages;


public class ObjectToDrawEncoder implements Encoder.Text<ObjectToDraw>{

	@Override
	public String encode (ObjectToDraw object) throws EncodeException{
		JsonObject jsonObject = JsonObject.createObjectBuilder()
				.add("type", object.getType())
				.add("imageID", object.getImageID().toString()
				.add("")
				
	}
}
