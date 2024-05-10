import SwiftUI
import shared

/**
 NOTE: Didn't get around to adding the button view on iOS,
 but the groundwork is there to do so
 */

struct ContentView: View {
	let greet = Greeting().greet()

	var body: some View {
		Text(greet)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}