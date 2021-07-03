-- we are using uuids as default id values
create extension if not exists "uuid-ossp";

-- let's use utc for sure
DROP FUNCTION IF EXISTS now_utc;
create or replace function now_utc() returns timestamp as
$$
select now() at time zone 'utc';
$$ language sql;

-- increment lock_version if not done
DROP FUNCTION IF EXISTS unknown_enum_value;
CREATE OR REPLACE FUNCTION unknown_enum_value()
    RETURNS varchar AS
$$
BEGIN
    RETURN 'UNKNOWN';
END;
$$ language plpgsql;
