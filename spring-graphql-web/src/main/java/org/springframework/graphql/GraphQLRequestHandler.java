/*
 * Copyright 2002-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.graphql;

import reactor.core.publisher.Mono;

/**
 * Contract to handle a GraphQL request.
 */
@FunctionalInterface
public interface GraphQLRequestHandler {

	/**
	 * Handle the request and return the result of execution.
	 * @param input the GraphQL query
	 * @return the execution result
	 */
	Mono<WebOutput> handle(WebInput input);

}