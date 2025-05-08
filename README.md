## 📖 Branch Naming Convention

To ensure consistency and clarity in our Git workflow, we follow a strict branch naming convention:

- `feature/feature-name`: For new feature development  
  - Example: `feature/user-authentication`
  
- `bugfix/bug-description`: For fixing non-critical bugs  
  - Example: `bugfix/login-error`
  
- `hotfix/critical-fix`: For urgent production fixes  
  - Example: `hotfix/security-patch`
  
- `release/x.y.z`: For preparing new releases  
  - Example: `release/1.2.0`
  
- `docs/description`: For documentation changes  
  - Example: `docs/readme-update`

---

## ☑️ Commit Message Guidelines

We follow the [Conventional Commits](https://www.conventionalcommits.org/) specification to maintain readable and consistent commit history.

**Examples:**
- `feat: add login functionality`
- `fix: handle null pointer on user service`
- `docs: update README with usage examples`
- `refactor: simplify validation logic`
- `test: add unit tests for user service`
- `chore: update dependencies`

## 🫧 Pull Requests Workflow

All changes must go through a **Pull Request (PR)** review before being merged into the `main` branch.

### Steps to follow:

1. Create a new branch following the naming conventions, or update in a created branch.
2. Make your changes and commit using Conventional Commits.
3. Push the branch.  
4. Open a Pull Request on GitHub.
5. Wait for the approval before merging.



