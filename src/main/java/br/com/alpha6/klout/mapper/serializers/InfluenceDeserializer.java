package br.com.alpha6.klout.mapper.serializers;

import br.com.alpha6.klout.model.Influence;
import br.com.alpha6.klout.model.User;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

/**
 * Custom Gson deserializer for {@link Influence}.
 *
 * @author fkurkowski
 * @author thiagojv
 */
public class InfluenceDeserializer implements JsonDeserializer<Influence> {

	public Influence deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
			throws JsonParseException {

		JsonObject jo = (JsonObject) json;

		List<User> influencers = getAsList(context, jo.getAsJsonArray("myInfluencers"));
		int influencersCount = jo.getAsJsonPrimitive("myInfluencersCount").getAsInt();

		List<User> influencees = getAsList(context, jo.getAsJsonArray("myInfluencees"));
		int influenceesCount = jo.getAsJsonPrimitive("myInfluenceesCount").getAsInt();

		return new Influence(influencers, influencees, influencersCount, influenceesCount);
	}

	private List<User> getAsList(JsonDeserializationContext context, JsonArray element) {
		User[] users = context.deserialize(element, User[].class);
		return Arrays.asList(users);
	}
}