/*
 * Copyright (C) 2011 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kercer.kernet.http;

import com.kercer.kernet.http.KCDeliveryResponse;
import com.kercer.kernet.http.KCHttpRequest;
import com.kercer.kernet.http.KCHttpResponse;
import com.kercer.kernet.http.error.KCNetError;

/**
 * An interface for performing requests.
 */
public interface KCNetwork
{
	/**
	 * Performs the specified request.
	 *
	 * @param request
	 *            Request to process
	 * @param aDelivery
	 *            delivery
	 * @return A {@link KCHttpResponse} with data and caching metadata; will never be null
	 * @throws KCNetError
	 *             on errors
	 */
	public KCHttpResponse performRequest(KCHttpRequest<?> request, KCDeliveryResponse aDelivery) throws KCNetError;
}
