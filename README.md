# helix-plat-terraform-forge

`helix-plat-terraform-forge` keeps a focused Java implementation around platform engineering. The project goal is to package a Java local lab for terraform analysis with transition tables, invalid-transition tests, and documented operating limits.

## Reason For The Project

The project exists to keep a narrow engineering decision visible and testable. For this repo, that decision is how rollout width and route drift should influence a review result.

## Helix Plat Terraform Forge Review Notes

`recovery` and `baseline` are the cases worth reading first. They show the optimistic and cautious ends of the fixture.

## What It Does

- `fixtures/domain_review.csv` adds cases for rollout width and quota pressure.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/helix-plat-terraform-walkthrough.md` walks through the case spread.
- The Java code includes a review path for `secret scope` and `rollout width`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## How It Is Put Together

The repository has two validation layers: the original compact policy fixture and the domain review fixture. They are separate so one can change without hiding failures in the other.

The Java implementation avoids hidden state so fixture changes are easy to reason about.

## Run It

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Check It

The verifier is intentionally local. It should fail if the fixture score math, lane assignment, or language-specific test drifts.

## Boundaries

The repository is intentionally scoped to local checks. I would expand it by adding adversarial fixtures before adding features.
