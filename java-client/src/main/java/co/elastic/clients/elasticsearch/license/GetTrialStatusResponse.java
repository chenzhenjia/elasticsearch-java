/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.license;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.util.Objects;

// typedef: license.get_trial_status.Response
@JsonpDeserializable
public final class GetTrialStatusResponse implements JsonpSerializable {
	private final boolean eligibleToStartTrial;

	// ---------------------------------------------------------------------------------------------

	public GetTrialStatusResponse(Builder builder) {

		this.eligibleToStartTrial = Objects.requireNonNull(builder.eligibleToStartTrial, "eligible_to_start_trial");

	}

	/**
	 * API name: {@code eligible_to_start_trial}
	 */
	public boolean eligibleToStartTrial() {
		return this.eligibleToStartTrial;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("eligible_to_start_trial");
		generator.write(this.eligibleToStartTrial);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetTrialStatusResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetTrialStatusResponse> {
		private Boolean eligibleToStartTrial;

		/**
		 * API name: {@code eligible_to_start_trial}
		 */
		public Builder eligibleToStartTrial(boolean value) {
			this.eligibleToStartTrial = value;
			return this;
		}

		/**
		 * Builds a {@link GetTrialStatusResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetTrialStatusResponse build() {

			return new GetTrialStatusResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetTrialStatusResponse}
	 */
	public static final JsonpDeserializer<GetTrialStatusResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetTrialStatusResponse::setupGetTrialStatusResponseDeserializer, Builder::build);

	protected static void setupGetTrialStatusResponseDeserializer(
			DelegatingDeserializer<GetTrialStatusResponse.Builder> op) {

		op.add(Builder::eligibleToStartTrial, JsonpDeserializer.booleanDeserializer(), "eligible_to_start_trial");

	}

}
