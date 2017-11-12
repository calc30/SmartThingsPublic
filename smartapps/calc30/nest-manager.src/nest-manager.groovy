/**
 *  Nest-Manager
 *
 *  Copyright 2017 Jeff Barton
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
definition(
    name: "Nest-Manager",
    namespace: "calc30",
    author: "Jeff Barton",
    description: "My Nest",
    category: "Convenience",
    iconUrl: "https://www.homedepot.com/catalog/productImages/1000/fb/fb78fe3e-5cad-43cb-af1d-9efb4b4973f1_1000.jpg",
    iconX2Url: "https://www.homedepot.com/catalog/productImages/1000/fb/fb78fe3e-5cad-43cb-af1d-9efb4b4973f1_1000.jpg",
    iconX3Url: "https://www.homedepot.com/catalog/productImages/1000/fb/fb78fe3e-5cad-43cb-af1d-9efb4b4973f1_1000.jpg")


preferences {
	section("Title") {
		// TODO: put inputs here
	}
}

def installed() {
	log.debug "Installed with settings: ${settings}"

	initialize()
}

def updated() {
	log.debug "Updated with settings: ${settings}"

	unsubscribe()
	initialize()
}

def initialize() {
	// TODO: subscribe to attributes, devices, locations, etc.
}

// TODO: implement event handlers