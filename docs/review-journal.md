# Review Journal

The repository goal stays the same: package a Java local lab for terraform analysis with transition tables, invalid-transition tests, and documented operating limits. This note explains the added review angle.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its platform engineering focus without claiming live deployment or external usage.

## Cases

- `baseline`: `rollout width`, score 146, lane `ship`
- `stress`: `quota pressure`, score 193, lane `ship`
- `edge`: `route drift`, score 185, lane `ship`
- `recovery`: `secret scope`, score 219, lane `ship`
- `stale`: `rollout width`, score 210, lane `ship`

## Note

A future change should add new cases before it changes the scoring rule.
