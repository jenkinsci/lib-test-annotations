/*
 * While this is not a plugin, it is much simpler to reuse the pipeline code for CI. This allows for
 * easy Linux/Windows testing and produces incrementals. The only feature that relates to plugins is
 * allowing one to test against multiple Jenkins versions.
 */
buildPlugin(configurations: [
  [ platform: 'linux', jdk: '8', jenkins: null ],
  [ platform: 'linux', jdk: '11', jenkins: null, javaLevel: '8' ],
  [ platform: 'windows', jdk: '11', jenkins: null, javaLevel: '8' ]
])