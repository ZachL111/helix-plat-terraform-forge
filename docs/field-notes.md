# Field Notes

This note keeps the platform engineering assumptions visible beside the checks.

The domain cases cover `rollout width`, `quota pressure`, `route drift`, and `secret scope`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

`recovery` is the strongest case at 219 on `secret scope`. `baseline` is the cautious anchor at 146 on `rollout width`.

The language-specific addition keeps the review model in a package class with direct assertions.
