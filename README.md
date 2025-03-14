## Temporal Protobuf Error Example

Including both Temporal SDK v1.28.x and Spring Pulsar will result in protobuf compilation issues. 
This repo is minimal requirements to re-produce the issue.

To test run the following:
```bash
./gradlew :app:test
```