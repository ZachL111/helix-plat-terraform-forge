# Helix Plat Terraform Forge Walkthrough

I use this file as a small checklist before changing the Java implementation.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | rollout width | 146 | ship |
| stress | quota pressure | 193 | ship |
| edge | route drift | 185 | ship |
| recovery | secret scope | 219 | ship |
| stale | rollout width | 210 | ship |

Start with `recovery` and `baseline`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

If `baseline` becomes less cautious without a clear reason, I would inspect the drag input first.
