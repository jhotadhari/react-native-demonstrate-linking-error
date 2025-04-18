package demonstratelinkingerror.example

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule

@ReactModule(name = DemonstrateLinkingErrorExampleModule.NAME)
class DemonstrateLinkingErrorExampleModule(reactContext: ReactApplicationContext) :
  NativeDemonstrateLinkingErrorExampleSpec(reactContext) {

  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  override fun add(a: Double, b: Double): Double {
    return a + b
  }

  companion object {
    const val NAME = "DemonstrateLinkingErrorExample"
  }
}
