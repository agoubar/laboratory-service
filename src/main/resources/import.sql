
-- artifact

INSERT INTO public.artifact (id, artifactid, groupid) VALUES (1, 'laboratory', 'com.manpower.laboratory');

-- artifact_version

INSERT INTO public.artifact_version (id, number, artifact_id) VALUES (1, '1.0.0', 1);
INSERT INTO public.artifact_version (id, number, artifact_id) VALUES (2, '1.0.1-SNAPSHOT', 1);

-- framework

INSERT INTO public.framework (id, name) VALUES (1, 'quarkus');

-- framework_version

INSERT INTO public.framework_version (id, number, framework_id) VALUES (1, '0.16.1', 1);

-- artifact_framework

INSERT INTO public.artifact_framework (artifact_version_id, framework_version_id) VALUES (1, 1);
INSERT INTO public.artifact_framework (artifact_version_id, framework_version_id) VALUES (2, 1);