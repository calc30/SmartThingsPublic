/**
 *  Nest
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
metadata {
	definition (name: "Nest", namespace: "azjbarton@icloud.com", author: "Jeff Barton") {
		capability "Polling"
		capability "Presence Sensor"
		capability "Relative Humidity Measurement"
		capability "Sensor"
		capability "Temperature Measurement"

		attribute "temperatureUnit", "string"

		command "away"
		command "present"
		command "setPresence"
		command "heatingSetpointDown"
		command "heatingSetpointUp"
		command "coolingSetpointUp"
		command "coolingSetpointDown"
		command "setFahrenheit"
		command "setCelsius"
	}


	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
		// TODO: define your main and details tiles here
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"
	// TODO: handle 'presence' attribute
	// TODO: handle 'humidity' attribute
	// TODO: handle 'temperature' attribute
	// TODO: handle 'temperatureUnit' attribute

}

// handle commands
def poll() {
	log.debug "Executing 'poll'"
	// TODO: handle 'poll' command
}

def away() {
	log.debug "Executing 'away'"
	// TODO: handle 'away' command
}

def present() {
	log.debug "Executing 'present'"
	// TODO: handle 'present' command
}

def setPresence() {
	log.debug "Executing 'setPresence'"
	// TODO: handle 'setPresence' command
}

def heatingSetpointDown() {
	log.debug "Executing 'heatingSetpointDown'"
	// TODO: handle 'heatingSetpointDown' command
}

def heatingSetpointUp() {
	log.debug "Executing 'heatingSetpointUp'"
	// TODO: handle 'heatingSetpointUp' command
}

def coolingSetpointUp() {
	log.debug "Executing 'coolingSetpointUp'"
	// TODO: handle 'coolingSetpointUp' command
}

def coolingSetpointDown() {
	log.debug "Executing 'coolingSetpointDown'"
	// TODO: handle 'coolingSetpointDown' command
}

def setFahrenheit() {
	log.debug "Executing 'setFahrenheit'"
	// TODO: handle 'setFahrenheit' command
}

def setCelsius() {
	log.debug "Executing 'setCelsius'"
	// TODO: handle 'setCelsius' command
}