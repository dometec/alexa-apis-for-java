/*
* Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
* except in compliance with the License. A copy of the License is located at
*
* http://aws.amazon.com/apache2.0/
*
* or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
* the specific language governing permissions and limitations under the License.
*/

package com.amazon.ask.model.services.ups;

import com.amazon.ask.model.services.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



public class UpsServiceClient extends BaseServiceClient implements UpsService {

  public UpsServiceClient(ApiConfiguration apiConfiguration) {
    super(apiConfiguration);
  }

  /**
   * 
   * Gets the email address of the customer associated with the current enablement. Requires customer consent for scopes: [alexa::profile:email:read] 
   * @return String
   * @throws ServiceException if fails to make API call
   */
  public String getProfileEmail() throws com.amazon.ask.model.services.ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(String.class, 200, "Successfully retrieved the requested information."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 204, "The query did not return any results."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 401, "The authentication token is malformed or invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 403, "The authentication token does not have access to resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 429, "The skill has been throttled due to an excessive number of requests."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 0, "An unexpected error occurred."));

    return (String)this.invoke("GET", this.apiEndpoint, "/v2/accounts/~current/settings/Profile.email", queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null ,String.class);
  }
  /**
   * 
   * Gets the given name (first name) of the customer associated with the current enablement. Requires customer consent for scopes: [alexa::profile:given_name:read] 
   * @return String
   * @throws ServiceException if fails to make API call
   */
  public String getProfileGivenName() throws com.amazon.ask.model.services.ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(String.class, 200, "Successfully retrieved the requested information."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 204, "The query did not return any results."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 401, "The authentication token is malformed or invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 403, "The authentication token does not have access to resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 429, "The skill has been throttled due to an excessive number of requests."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 0, "An unexpected error occurred."));

    return (String)this.invoke("GET", this.apiEndpoint, "/v2/accounts/~current/settings/Profile.givenName", queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null ,String.class);
  }
  /**
   * 
   * Gets the mobile phone number of the customer associated with the current enablement. Requires customer consent for scopes: [alexa::profile:mobile_number:read] 
   * @return com.amazon.ask.model.services.ups.PhoneNumber
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.ups.PhoneNumber getProfileMobileNumber() throws com.amazon.ask.model.services.ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.PhoneNumber.class, 200, "Successfully retrieved the requested information."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 204, "The query did not return any results."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 401, "The authentication token is malformed or invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 403, "The authentication token does not have access to resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 429, "The skill has been throttled due to an excessive number of requests."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 0, "An unexpected error occurred."));

    return (com.amazon.ask.model.services.ups.PhoneNumber)this.invoke("GET", this.apiEndpoint, "/v2/accounts/~current/settings/Profile.mobileNumber", queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null ,com.amazon.ask.model.services.ups.PhoneNumber.class);
  }
  /**
   * 
   * Gets the full name of the customer associated with the current enablement. Requires customer consent for scopes: [alexa::profile:name:read] 
   * @return String
   * @throws ServiceException if fails to make API call
   */
  public String getProfileName() throws com.amazon.ask.model.services.ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(String.class, 200, "Successfully retrieved the requested information."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 204, "The query did not return any results."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 401, "The authentication token is malformed or invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 403, "The authentication token does not have access to resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 429, "The skill has been throttled due to an excessive number of requests."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 0, "An unexpected error occurred."));

    return (String)this.invoke("GET", this.apiEndpoint, "/v2/accounts/~current/settings/Profile.name", queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null ,String.class);
  }
  /**
   * 
   * Gets the distance measurement unit of the device. Does not require explict customer consent. 
   * @param deviceId The device Id (required)
   * @return com.amazon.ask.model.services.ups.DistanceUnits
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.ups.DistanceUnits getSystemDistanceUnits(String deviceId) throws com.amazon.ask.model.services.ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
      pathParams.put("deviceId", deviceId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.DistanceUnits.class, 200, "Successfully get the setting"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 204, "The query did not return any results."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 401, "The authentication token is malformed or invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 403, "The authentication token does not have access to resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 429, "The skill has been throttled due to an excessive number of requests."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 0, "An unexpected error occurred."));

    return (com.amazon.ask.model.services.ups.DistanceUnits)this.invoke("GET", this.apiEndpoint, "/v2/devices/{deviceId}/settings/System.distanceUnits", queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null ,com.amazon.ask.model.services.ups.DistanceUnits.class);
  }
  /**
   * 
   * Gets the temperature measurement units of the device. Does not require explict customer consent. 
   * @param deviceId The device Id (required)
   * @return com.amazon.ask.model.services.ups.TemperatureUnit
   * @throws ServiceException if fails to make API call
   */
  public com.amazon.ask.model.services.ups.TemperatureUnit getSystemTemperatureUnit(String deviceId) throws com.amazon.ask.model.services.ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
      pathParams.put("deviceId", deviceId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.TemperatureUnit.class, 200, "Successfully get the setting"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 204, "The query did not return any results."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 401, "The authentication token is malformed or invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 403, "The authentication token does not have access to resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 429, "The skill has been throttled due to an excessive number of requests."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 0, "An unexpected error occurred."));

    return (com.amazon.ask.model.services.ups.TemperatureUnit)this.invoke("GET", this.apiEndpoint, "/v2/devices/{deviceId}/settings/System.temperatureUnit", queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null ,com.amazon.ask.model.services.ups.TemperatureUnit.class);
  }
  /**
   * 
   * Gets the time zone of the device. Does not require explict customer consent. 
   * @param deviceId The device Id (required)
   * @return String
   * @throws ServiceException if fails to make API call
   */
  public String getSystemTimeZone(String deviceId) throws com.amazon.ask.model.services.ServiceException {
    List<Pair<String, String>> queryParams = new ArrayList<Pair<String, String>>();
    Map<String, String> pathParams = new HashMap<String, String>();
      pathParams.put("deviceId", deviceId);
    List<Pair<String, String>> headerParams = new ArrayList<Pair<String, String>>();
    headerParams.add(new Pair<String, String>("Content-type", "application/json"));

    String apiAuthorizationValue = "Bearer " +  this.authorizationValue;
    headerParams.add(new Pair<>("Authorization", apiAuthorizationValue));

    List<ServiceClientResponse> serviceResponseDefinitions = new ArrayList<>();
    serviceResponseDefinitions.add(new ServiceClientResponse(String.class, 200, "Successfully get the setting"));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 204, "The query did not return any results."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 401, "The authentication token is malformed or invalid."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 403, "The authentication token does not have access to resource."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 429, "The skill has been throttled due to an excessive number of requests."));
    serviceResponseDefinitions.add(new ServiceClientResponse(com.amazon.ask.model.services.ups.Error.class, 0, "An unexpected error occurred."));

    return (String)this.invoke("GET", this.apiEndpoint, "/v2/devices/{deviceId}/settings/System.timeZone", queryParams, headerParams,
      pathParams, serviceResponseDefinitions, null ,String.class);
  }
}
