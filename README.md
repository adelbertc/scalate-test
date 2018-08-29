# scalate-test

Expected output:

```
spec:
  env:
    FOO: 1,024
  resources:
    requests:
      cpu: 1
```

Received output with `sbt run` (note `resources` is indented incorrectly):

```
spec:
  env:
    FOO: 1,024
    resources:
    requests:
      cpu: 1
```

### License
Code is provided under the Apache 2.0 license available at http://opensource.org/licenses/Apache-2.0,
as well as in the LICENSE file.
